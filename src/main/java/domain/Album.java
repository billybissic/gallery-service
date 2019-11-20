/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Billy Bissic
 *
 */
@Document(collection = "photo-albums")
public class Album {
	
	@Id private String _id;
	private String album_name;
	private String album_description;
	private String album_caption;
	private AlbumType album_type;
	private UserProfile album_owner;
	private boolean is_private;
	private Photo album_cover_photo;
	private Iterable<Photo> photos;
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
	 * @return the album_name
	 */
	public String getAlbum_name() {
		return album_name;
	}
	/**
	 * @param album_name the album_name to set
	 */
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	/**
	 * @return the album_description
	 */
	public String getAlbum_description() {
		return album_description;
	}
	/**
	 * @param album_description the album_description to set
	 */
	public void setAlbum_description(String album_description) {
		this.album_description = album_description;
	}
	/**
	 * @return the album_caption
	 */
	public String getAlbum_caption() {
		return album_caption;
	}
	/**
	 * @param album_caption the album_caption to set
	 */
	public void setAlbum_caption(String album_caption) {
		this.album_caption = album_caption;
	}
	/**
	 * @return the album_type
	 */
	public AlbumType getAlbum_type() {
		return album_type;
	}
	/**
	 * @param album_type the album_type to set
	 */
	public void setAlbum_type(AlbumType album_type) {
		this.album_type = album_type;
	}
	/**
	 * @return the album_owner
	 */
	public UserProfile getAlbum_owner() {
		return album_owner;
	}
	/**
	 * @param album_owner the album_owner to set
	 */
	public void setAlbum_owner(UserProfile album_owner) {
		this.album_owner = album_owner;
	}
	/**
	 * @return the is_private
	 */
	public boolean isIs_private() {
		return is_private;
	}
	/**
	 * @param is_private the is_private to set
	 */
	public void setIs_private(boolean is_private) {
		this.is_private = is_private;
	}
	/**
	 * @return the album_cover_photo
	 */
	public Photo getAlbum_cover_photo() {
		return album_cover_photo;
	}
	/**
	 * @param album_cover_photo the album_cover_photo to set
	 */
	public void setAlbum_cover_photo(Photo album_cover_photo) {
		this.album_cover_photo = album_cover_photo;
	}
	/**
	 * @return the photos
	 */
	public Iterable<Photo> getPhotos() {
		return photos;
	}
	/**
	 * @param photos the photos to set
	 */
	public void setPhotos(Iterable<Photo> photos) {
		this.photos = photos;
	}
}
