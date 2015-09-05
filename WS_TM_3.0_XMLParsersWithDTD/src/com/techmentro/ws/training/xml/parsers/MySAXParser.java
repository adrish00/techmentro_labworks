package com.techmentro.ws.training.xml.parsers;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAXParser {

	public MySAXParser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter FileName:");
		Scanner in = new Scanner (System.in);
		String file = in.nextLine();
		in.close();
		SAXParserFactory f = SAXParserFactory.newInstance();
		try{
			SAXParser parser = f.newSAXParser();
			DefaultHandler handler = new DefaultHandler(){
				@SuppressWarnings("unused")
				public void starElement(String uri,String localName,String qName,Attributes attributes)
				throws SAXException	{
					System.out.println("<"+qName+">");
					for(int i=0 ; i<attributes.getLength() ; i++){
						System.out.println(attributes.getLocalName(i)+" = "+attributes.getValue(i));
					}
				}
				
				public void endElement (String uri,String localName,String qName) throws SAXException{
					System.out.println("</"+qName+">");
				}
				public void characters(char []ch,int start,int length) throws SAXException{
					System.out.println(ch);
				}
			};
			System.out.println(new File(file).getAbsolutePath());
			parser.parse(MyDomParser.class.getResourceAsStream("/"+file), handler);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
