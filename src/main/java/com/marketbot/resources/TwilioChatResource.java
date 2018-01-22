package com.marketbot.resources;

import com.codahale.metrics.annotation.Timed;
import com.twilio.twiml.Body;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.TwiMLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

import static java.util.Objects.isNull;

@Path("/service")
public class TwilioChatResource extends ChatResource {

    @POST
    @Timed
    @Path("/webHook")
    @Produces(MediaType.APPLICATION_XML)
    public HttpServletResponse twilioWebHook(@Context HttpServletRequest httpServletRequest, @Context HttpServletResponse httpServletResponse) throws IOException {

        String fromNumber = getFromNumberFromBody(httpServletRequest);

        if (isNull(fromNumber)) {
            httpServletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            httpServletResponse.getWriter().println("<html><body><p>Couldn't extract FromNo from client request</p></body></html>");
            return httpServletResponse;
        }

        com.twilio.twiml.Message sms;

        if (customerComms.containsKey(fromNumber)) {
            sms = new com.twilio.twiml.Message.Builder().body(new Body(message2)).build();
            customerComms.put(fromNumber, customerComms.get(fromNumber) + 1);
        }
        else {

            sms = new com.twilio.twiml.Message.Builder().body(new Body(message1)).build();
            customerComms.put(fromNumber, 1);
        }

        MessagingResponse twiml = new MessagingResponse.Builder().message(sms).build();

        httpServletResponse.setContentType("application/xml");

        try {
            httpServletResponse.getWriter().print(twiml.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
        return httpServletResponse;
    }

}
