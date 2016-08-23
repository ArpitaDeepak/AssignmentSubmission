package com.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class ParsingJason {
	public ArrayList<User> jsonResponse() {
		ArrayList<User> userList = new ArrayList<User>();
		try {
			URL url = new URL(
					"https://api.github.com/users");
			InputStream is;
			is = url.openStream();
			JsonReader json_Reader = Json.createReader(is);
			// JsonReader json_Reader = Json.createReader(new
			// StringReader("[{\"id\":\"123\"}]"));
			JsonArray json_Array = json_Reader.readArray();
			
			for (int i = 0; i < json_Array.size(); i++) {
				JsonObject json_Object = (JsonObject) json_Array.get(i);
				User user = new User();
				user.setLogin(json_Object.getString("login"));
				user.setId(json_Object.getInt("id"));
				user.setAvatar_url(json_Object.getString("avatar_url"));
				user.setGravatar_id(json_Object.getString("gravatar_id"));
				user.setUrl(json_Object.getString("url"));
				user.setFollowers_url(json_Object.getString("followers_url"));
				user.setFollowing_url(json_Object.getString("following_url"));
				user.setGists_url(json_Object.getString("gists_url"));
				user.setStarred_url(json_Object.getString("starred_url"));
				user.setSubscriptions_url(json_Object
						.getString("subscriptions_url"));
				user.setOrganizations_url(json_Object
						.getString("organizations_url"));
				user.setRepos_url(json_Object.getString("repos_url"));
				user.setEvents_url(json_Object.getString("events_url"));
				user.setReceived_events_url(json_Object
						.getString("received_events_url"));
				user.setType(json_Object.getString("type"));
				user.setSite_admin(json_Object.getBoolean("site_admin"));
				userList.add(user);
				//System.out.println(user);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return userList;
	}

	public static void main(String[] args) {
		ParsingJason parseObj = new ParsingJason();
		parseObj.jsonResponse();
	}
}
