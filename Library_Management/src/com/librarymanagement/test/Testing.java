package com.librarymanagement.test;

import org.junit.Assert;
import org.junit.Test;

import com.librarymanagement.bean.LibraryBean;

public class Testing {

	
	LibraryBean libraryBean=new LibraryBean();
	String book1="";
    String author1="";
    String place1="";
    String book2="";
    String author2="";
    String place2="";
    String book3="";
    String author3="";
    String place3="";
    String book4="";
    String author4="";
    String place4="";
    String book5="";
    String author5="";
    String place5="";


    @Test
    public void testBook1() {
    	book1 = "ABC";
    	libraryBean.setBook1(book1);
    	Assert.assertEquals(book1,libraryBean.getBook1());
    }
    
    
    @Test
    public void testBook2() {
    	book2 = "DEF";
    	libraryBean.setBook2(book2);
    	Assert.assertEquals(book2,libraryBean.getBook2());
    }
    

    @Test
    public void testBook3() {
    	book3 = "GHI";
    	libraryBean.setBook3(book3);
    	Assert.assertEquals(book3,libraryBean.getBook3());
    }
    
    @Test
    public void testBooK4() {
    	book4 = "JKL";
    	libraryBean.setBook4(book4);
    	Assert.assertEquals(book4,libraryBean.getBook4());
    }
    

    @Test
    public void testBook5() {
    	book5 = "MNO";
    	libraryBean.setBook5(book5);
    	Assert.assertEquals(book5,libraryBean.getBook5());
    }
    
    @Test
    public void testAuthor1() {
    	author1 = "ABC";
    	libraryBean.setAuthor1(author1);
    	Assert.assertEquals(author1,libraryBean.getAuthor1());
    }
    
    @Test
    public void testAuthor2() {
    	author2 = "DEF";
    	libraryBean.setAuthor2(author2);
    	Assert.assertEquals(author2,libraryBean.getAuthor2());
    }
    
    @Test
    public void testAuthor3() {
    	author3 = "GHI";
    	libraryBean.setAuthor3(author3);
    	Assert.assertEquals(author3,libraryBean.getAuthor3());
    }
    
    @Test
    public void testAuthor4() {
    	author4 = "JKL";
    	libraryBean.setAuthor4(author4);
    	Assert.assertEquals(author4,libraryBean.getAuthor4());
    }
    
    @Test
    public void testAuthor5() {
    	author5 = "MNO";
    	libraryBean.setAuthor5(author5);
    	Assert.assertEquals(author5,libraryBean.getAuthor5());
    }
    
    @Test
    public void testPlace1() {
    	place1 = "ABC";
    	libraryBean.setPlace1(place1);
    	Assert.assertEquals(place1,libraryBean.getPlace1());
    }
    
    @Test
    public void testPlace2() {
    	place2 = "DEF";
    	libraryBean.setPlace2(place2);
    	Assert.assertEquals(place2,libraryBean.getPlace2());
    }
    
    @Test
    public void testPlace3() {
    	place3 = "GHI";
    	libraryBean.setPlace3(place3);
    	Assert.assertEquals(place3,libraryBean.getPlace3());
    }
    
    @Test
    public void testPlace4() {
    	place4 = "JKL";
    	libraryBean.setPlace4(place4);
    	Assert.assertEquals(place4,libraryBean.getPlace4());
    }
    
    @Test
    public void testPlace5() {
    	place5 = "MNO";
    	libraryBean.setPlace5(place5);
    	Assert.assertEquals(place5,libraryBean.getPlace5());
    }
    
}
