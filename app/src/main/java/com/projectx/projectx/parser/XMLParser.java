package com.projectx.projectx.parser;

import com.projectx.projectx.models.Resources;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/**
 * Created by nshaikh on 2/4/2016.
 */
public class XMLParser extends DefaultHandler {
    ArrayList<Resources> list =   null;
    StringBuilder builder;
    Resources color   =   null;

    @Override
    public void startDocument(){
        list = new ArrayList<Resources>();
    }

    public ArrayList getlist(){
        return  list;
    }

    @Override
    public void startElement(String uri, String localName, String qName,Attributes attributes) {
        builder =   new StringBuilder();
        if(localName.equals("color")){
            color =  new Resources();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName){
        if(localName.equals("color")){
            color.setColor(builder.toString());
            list.add(color);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length){
        String tempString=new String(ch, start, length);
        builder.append(tempString);
    }
}
