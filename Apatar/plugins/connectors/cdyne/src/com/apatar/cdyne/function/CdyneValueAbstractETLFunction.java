/*
_______________________

Apatar Open Source Data Integration

Copyright (C) 2005-2007, Apatar, Inc.

info@apatar.com

195 Meadow St., 2nd Floor

Chicopee, MA 01013

 

    This program is free software; you can redistribute it and/or modify

    it under the terms of the GNU General Public License as published by

    the Free Software Foundation; either version 2 of the License, or

    (at your option) any later version.

 

    This program is distributed in the hope that it will be useful,

    but WITHOUT ANY WARRANTY; without even the implied warranty of

    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the

    GNU General Public License for more details.

 

    You should have received a copy of the GNU General Public License along

    with this program; if not, write to the Free Software Foundation, Inc.,

    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

________________________

*/
 


package com.apatar.cdyne.function;

import java.util.List;

import com.apatar.cdyne.Cdyne;
import com.apatar.cdyne.CdyneFunction;
import com.apatar.core.ValueAbstractApatarFunction;

public abstract class CdyneValueAbstractETLFunction extends
		ValueAbstractApatarFunction implements CdyneFunction {
	
	String licenseKey;
	String userName;
	Cdyne node;
	
	public Object execute(List l, String licenseKey, Cdyne node) {
		this.licenseKey = licenseKey;
		this.node = node;
		return execute(l);
	}

}

