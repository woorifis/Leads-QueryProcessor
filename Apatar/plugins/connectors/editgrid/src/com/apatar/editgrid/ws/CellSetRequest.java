/**
 * CellSetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.apatar.editgrid.ws;

public class CellSetRequest implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long				serialVersionUID	= -7036464980987934515L;
	private java.lang.String				sessionKey;
	private java.lang.String				workbook;
	private java.lang.String				range;
	private java.lang.String				returnRange;
	private com.apatar.editgrid.ws.Cell[]	body;

	public CellSetRequest() {
	}

	public CellSetRequest(java.lang.String sessionKey,
			java.lang.String workbook, java.lang.String range,
			java.lang.String returnRange, com.apatar.editgrid.ws.Cell[] body) {
		this.sessionKey = sessionKey;
		this.workbook = workbook;
		this.range = range;
		this.returnRange = returnRange;
		this.body = body;
	}

	/**
	 * Gets the sessionKey value for this CellSetRequest.
	 * 
	 * @return sessionKey
	 */
	public java.lang.String getSessionKey() {
		return sessionKey;
	}

	/**
	 * Sets the sessionKey value for this CellSetRequest.
	 * 
	 * @param sessionKey
	 */
	public void setSessionKey(java.lang.String sessionKey) {
		this.sessionKey = sessionKey;
	}

	/**
	 * Gets the workbook value for this CellSetRequest.
	 * 
	 * @return workbook
	 */
	public java.lang.String getWorkbook() {
		return workbook;
	}

	/**
	 * Sets the workbook value for this CellSetRequest.
	 * 
	 * @param workbook
	 */
	public void setWorkbook(java.lang.String workbook) {
		this.workbook = workbook;
	}

	/**
	 * Gets the range value for this CellSetRequest.
	 * 
	 * @return range
	 */
	public java.lang.String getRange() {
		return range;
	}

	/**
	 * Sets the range value for this CellSetRequest.
	 * 
	 * @param range
	 */
	public void setRange(java.lang.String range) {
		this.range = range;
	}

	/**
	 * Gets the returnRange value for this CellSetRequest.
	 * 
	 * @return returnRange
	 */
	public java.lang.String getReturnRange() {
		return returnRange;
	}

	/**
	 * Sets the returnRange value for this CellSetRequest.
	 * 
	 * @param returnRange
	 */
	public void setReturnRange(java.lang.String returnRange) {
		this.returnRange = returnRange;
	}

	/**
	 * Gets the body value for this CellSetRequest.
	 * 
	 * @return body
	 */
	public com.apatar.editgrid.ws.Cell[] getBody() {
		return body;
	}

	/**
	 * Sets the body value for this CellSetRequest.
	 * 
	 * @param body
	 */
	public void setBody(com.apatar.editgrid.ws.Cell[] body) {
		this.body = body;
	}

	private java.lang.Object	__equalsCalc	= null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CellSetRequest)) {
			return false;
		}
		CellSetRequest other = (CellSetRequest) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((sessionKey == null && other.getSessionKey() == null) || (sessionKey != null && sessionKey
						.equals(other.getSessionKey())))
				&& ((workbook == null && other.getWorkbook() == null) || (workbook != null && workbook
						.equals(other.getWorkbook())))
				&& ((range == null && other.getRange() == null) || (range != null && range
						.equals(other.getRange())))
				&& ((returnRange == null && other.getReturnRange() == null) || (returnRange != null && returnRange
						.equals(other.getReturnRange())))
				&& ((body == null && other.getBody() == null) || (body != null && java.util.Arrays
						.equals(body, other.getBody())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean	__hashCodeCalc	= false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getSessionKey() != null) {
			_hashCode += getSessionKey().hashCode();
		}
		if (getWorkbook() != null) {
			_hashCode += getWorkbook().hashCode();
		}
		if (getRange() != null) {
			_hashCode += getRange().hashCode();
		}
		if (getReturnRange() != null) {
			_hashCode += getReturnRange().hashCode();
		}
		if (getBody() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getBody()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getBody(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc	typeDesc	= new org.apache.axis.description.TypeDesc(
																			CellSetRequest.class,
																			true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://api.editgrid.com", "CellSetRequest"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sessionKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "sessionKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("workbook");
		elemField.setXmlName(new javax.xml.namespace.QName("", "workbook"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("range");
		elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("returnRange");
		elemField.setXmlName(new javax.xml.namespace.QName("", "returnRange"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("body");
		elemField.setXmlName(new javax.xml.namespace.QName("", "body"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://api.editgrid.com", "Cell"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
