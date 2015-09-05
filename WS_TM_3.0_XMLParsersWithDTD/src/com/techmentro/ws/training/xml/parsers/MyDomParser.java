package com.techmentro.ws.training.xml.parsers;

import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MyDomParser {

	public MyDomParser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter FileName:");
		Scanner in = new Scanner (System.in);
		String file = in.nextLine();
		in.close();
		try{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(MyDomParser.class.getResourceAsStream("/"+file));
			Node node = doc.getFirstChild();
			while(node != null){
				traverseNode(node);
				node = node.getNextSibling();
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static void  traverseNode(Node node){
		if(node == null)
			return;
		if(node.getNodeType() == Node.ELEMENT_NODE){
			System.out.println("<"+node.getNodeName()+">");
			if(node.hasAttributes()){
				NamedNodeMap map = node.getAttributes();
				int index = 0 ; 
				while(true){
					Node attr = map.item(index+1);
					if(attr == null){
						break;
					}
					System.out.println(attr.getNodeName()+" = "+ attr.getTextContent());
				}
			}
		}
		if(node.hasChildNodes()){
			NodeList list = node.getChildNodes();
			int len= list.getLength();
			for(int i =0;i< len;i++){
				traverseNode(list.item(i));
			}
			//closing tag
			System.out.println("</"+node.getNodeName()+">");
		}
		else if (node.getNodeType() == Node.TEXT_NODE){
			System.out.println(node.getNodeValue().trim());
		}
	}
}
