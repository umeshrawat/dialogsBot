package com.marketbot.resources;

import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marketbot.api.SlackUtil;
import com.marketbot.model.JsonRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/service")
public class AIChatResource extends ChatResource
{
    @POST
    @Timed
    @Path("/aiWebHook")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response aiWebHook(JsonRequest request) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonInString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request.getResult().getFulfillment());

        SlackUtil.postToSlack(jsonInString);

        Response response = null;
        return response;
    }
}
