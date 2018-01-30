package com.room.sample.view;

import java.io.Serializable;

public class aaa implements Serializable{
	
    private static final long serialVersionUID = 1L;
    private String name;
    private String emailid;   
   	private String bdate;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public String getEmailid() {
        return emailid;
    }


    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    
    public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

}
