/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of lib-gwt-svg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg.events;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * The DOMFocusOut event occurs when an EventTarget loses focus.
 */
public class FocusOutEvent extends DomEvent<FocusOutHandler> {
	private static final Type<FocusOutHandler> TYPE = new Type<FocusOutHandler>(
			"focusout", new FocusOutEvent());

	/**
	 * Protected constructor, use
	 * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
	 * to fire mouse out events.
	 */
	protected FocusOutEvent() {
	}

	/**
	 * @return the handler type
	 */
	public Type<FocusOutHandler> getAssociatedType() {
		return TYPE;
	}

	/**
	 * @return the handler type
	 */
	public static Type<FocusOutHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(FocusOutHandler handler) {
		handler.onFocusOut(this);
	}
}