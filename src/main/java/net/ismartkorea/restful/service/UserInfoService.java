package net.ismartkorea.restful.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.ismartkorea.restful.dao.UserInfoDao;
import net.ismartkorea.restful.model.UserInfoVo;

@Path("/userinfo")
public class UserInfoService {

	static UserInfoDao dao;
	public void setUserInfoDao(UserInfoDao dao) {
		this.dao = dao;
	}
	
    /**
     * Create Contact Record
     * @param contact
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(UserInfoVo userInfo){
           dao.create(userInfo);
           return Response.status(200).entity(userInfo).build();

    }
    /**
     * Query Contact record by email id
     * @param email
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    public UserInfoVo get(@PathParam("name") String name){
           return dao.get(name);
    }
    /**
     * Upadte Contact Record by email
     * @param email
     * @param contact
     * @return
     */
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response  update(@PathParam("id") String id, UserInfoVo userInfo){
           dao.update(id, userInfo);
           return Response.status(200).entity(userInfo).build();
    }	
}
