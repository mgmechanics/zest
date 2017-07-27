/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package org.mozilla.zest.core.v1;


/**
 * The Class ZestLoopStateFile.
 */
public class ZestLoopStateRegex extends ZestLoopStateString {

	/**
	 * Instantiates a new zest loop state file.
	 */
	public ZestLoopStateRegex() {
		super();
	}
	
	public ZestLoopStateRegex(ZestLoopTokenRegexSet set) throws ZestClientFailException{
		super(set.getConvertedSet());
	}
}