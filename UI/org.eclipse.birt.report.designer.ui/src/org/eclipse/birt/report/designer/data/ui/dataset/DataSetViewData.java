/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation. All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Actuate Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.birt.report.designer.data.ui.dataset;

import java.sql.Types;

/**
 * The data set item used in data UI.
 *  
 */
public class DataSetViewData
{
	private transient String dataSetColumnName = null;

	private transient String name = null;

	private transient Object parent = null;

	private transient String dataTypeName = null;

	private transient int dataType = Types.VARCHAR;

	private transient int position = -1;

	private transient String alias = null;

	private transient String helpText = null;

	private transient boolean isComputedColumn = false;
	
	private transient String displayNameKey = null;

	/**
	 * @return the dataType.
	 */
	public final int getDataType( )
	{
		return dataType;
	}

	/**
	 * @param dataType
	 *            The dataType to set.
	 */
	public final void setDataType( int dataType )
	{
		this.dataType = dataType;
	}

	/**
	 * @return The dataTypeName.
	 */
	public final String getDataTypeName( )
	{
		return dataTypeName;
	}

	/**
	 * @param dataTypeName
	 *            The dataTypeName to set.
	 */
	public final void setDataTypeName( String dataTypeName )
	{
		this.dataTypeName = dataTypeName;
	}

	private transient String displayName = null;

	/**
	 * This method returns the display name and if the display name is null it
	 * returns the name
	 * 
	 * @return Returns the displayName.
	 */
	public String getDisplayName( )
	{
		if ( displayName != null && displayName.trim( ).length( ) > 0 )
		{
			return displayName;
		}

		if ( alias != null && alias.trim( ).length( ) > 0 )
		{
			return alias;
		}
		
		return getName( );
	}

	/**
	 * This method just returns the display name. It doesn't do any null checks
	 * 
	 * @return the display name
	 */
	public String getRealDisplayName( )
	{
		return displayName;
	}

	/**
	 * This is equivalent to setDisplayName. It is just added for conveninence
	 * in case of java bean introspection.
	 * 
	 * @param displayName
	 */
	public void setRealDisplayName( String displayName )
	{
		setDisplayName( displayName );
	}

	/**
	 * @param displayName
	 *            The displayName to set.
	 */
	public void setDisplayName( String displayName )
	{
		this.displayName = displayName;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName( )
	{
		if ( name == null || name.trim( ).length( ) == 0 )
		{
			return getDataSetColumnName( );
		}
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName( String name )
	{
		this.name = name;
	}

	/**
	 * @return Returns the parent.
	 */
	public Object getParent( )
	{
		return parent;
	}

	/**
	 * @param parent
	 *            The parent to set.
	 */
	public void setParent( Object parent )
	{
		this.parent = parent;
	}

	/**
	 * @return Returns the position.
	 */
	public int getPosition( )
	{
		return position;
	}

	/**
	 * @param position
	 *            The position to set.
	 */
	public void setPosition( int position )
	{
		this.position = position;
	}

	/**
	 * @return Returns the alias.
	 */
	public String getAlias( )
	{
		return alias;
	}

	/**
	 * @param alias
	 *            The alias to set.
	 */
	public void setAlias( String alias )
	{
		this.alias = alias;
	}

	/**
	 * @return Returns the helpText.
	 */
	public String getHelpText( )
	{
		return helpText;
	}

	/**
	 * @param helpText
	 *            The helpText to set.
	 */
	public void setHelpText( String helpText )
	{
		this.helpText = helpText;
	}

	/**
	 * @return Returns the dataSetColumnName.
	 */
	public String getDataSetColumnName( )
	{
		return dataSetColumnName;
	}

	/**
	 * @param dataSetColumnName
	 *            The dataSetColumnName to set.
	 */
	public void setDataSetColumnName( String dataSetColumnName )
	{
		this.dataSetColumnName = dataSetColumnName;
	}

	/**
	 * @return Returns the isComputedColumn.
	 */
	public boolean isComputedColumn( )
	{
		return isComputedColumn;
	}

	/**
	 * @param isComputedColumn
	 *            The isComputedColumn to set.
	 */
	public void setComputedColumn( boolean isComputedColumn )
	{
		this.isComputedColumn = isComputedColumn;
	}

	/**
	 * 
	 * @return
	 */
	public String getDisplayNameKey( )
	{
		return displayNameKey;
	}

	/**
	 * 
	 * @param displayNameKey
	 */
	public void setDisplayNameKey( String displayNameKey )
	{
		this.displayNameKey = displayNameKey;
	}

}
