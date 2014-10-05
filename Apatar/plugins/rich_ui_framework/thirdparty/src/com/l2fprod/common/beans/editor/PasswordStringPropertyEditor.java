/*
_______________________
Apatar Open Source Data Integration
Copyright (C) 2005-2007, Apatar, Inc.
info@apatar.com
195 Meadow St., 2nd Floor
Chicopee, MA 01013

### This program is free software; you can redistribute it and/or modify
### it under the terms of the GNU General Public License as published by
### the Free Software Foundation; either version 2 of the License, or
### (at your option) any later version.

### This program is distributed in the hope that it will be useful,
### but WITHOUT ANY WARRANTY; without even the implied warranty of
### MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.# See the
### GNU General Public License for more details.

### You should have received a copy of the GNU General Public License along
### with this program; if not, write to the Free Software Foundation, Inc.,
### 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
________________________

*/

package com.l2fprod.common.beans.editor;

import javax.swing.JPasswordField;
import javax.swing.text.JTextComponent;

import com.apatar.core.PasswordString;
import com.apatar.ui.JDefaultContextMenu;
import com.l2fprod.common.swing.LookAndFeelTweaks;

/**
 * PasswordStringPropertyEditor.<br>
 *
 */

public class PasswordStringPropertyEditor extends AbstractPropertyEditor {

	private PasswordString pass		= null;
	private JPasswordField textComp = null;
	
	public PasswordStringPropertyEditor(){
		editor = new JPasswordField();
	    ((JPasswordField)editor).setBorder(LookAndFeelTweaks.EMPTY_BORDER);
	    ((JPasswordField)editor).setComponentPopupMenu(
	    		new JDefaultContextMenu( (JPasswordField)editor ) );
	}
	
	public Object getValue() {
		this.pass.setValue( ((JTextComponent)editor).getText() );
		
		return this.pass;
	}
	
	public void setValue(Object value) {
		textComp = ((JPasswordField)editor);
		
		if (value == null)
			textComp.setText("");
	    else {
	    	this.pass  = (PasswordString) value;
	    	textComp.setText( this.pass.getValue() );	    
	    }
	}
	
}