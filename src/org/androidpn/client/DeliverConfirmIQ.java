package org.androidpn.client;

import org.jivesoftware.smack.packet.IQ;


/**
 * 
 * send a Delivered packet to server 
 * 
 * @author samuelnotes
 *
 */
public class DeliverConfirmIQ extends IQ {

	private String uuid; 
	
	
	@Override
	public String getChildElementXML() {
		  StringBuilder buf = new StringBuilder();
	        buf.append("<").append("deliverconfirm").append(" xmlns=\"").append(
	                "androidpn:iq:uuid").append("\">");
	        if (uuid != null) {
	            buf.append("<uuid>").append(uuid).append("</uuid>");
	        }
	        buf.append("</").append("deliverconfirm").append("> ");
	        return buf.toString();
	}



	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}



	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
