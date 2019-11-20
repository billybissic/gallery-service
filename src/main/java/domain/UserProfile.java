/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

/**
 * @author Billy Bissic
 *
 */
public class UserProfile {
	private Integer profile_id; 
	private Integer uuid;
	
	/**
	 * @return the profile_id
	 */
	public Integer getProfile_id() {
		return profile_id;
	}
	/**
	 * @param profile_id the profile_id to set
	 */
	public void setProfile_id(Integer profile_id) {
		this.profile_id = profile_id;
	}
	/**
	 * @return the uuid
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	} 
}
