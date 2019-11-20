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
public class AlbumType {

	private String _id;
	private String album_type_name;
	private String album_type_description;
	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the album_type_name
	 */
	public String getAlbum_type_name() {
		return album_type_name;
	}
	/**
	 * @param album_type_name the album_type_name to set
	 */
	public void setAlbum_type_name(String album_type_name) {
		this.album_type_name = album_type_name;
	}
	/**
	 * @return the album_type_description
	 */
	public String getAlbum_type_description() {
		return album_type_description;
	}
	/**
	 * @param album_type_description the album_type_description to set
	 */
	public void setAlbum_type_description(String album_type_description) {
		this.album_type_description = album_type_description;
	}
}
