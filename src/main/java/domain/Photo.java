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
public class Photo {
	private String file_name;
	private String upload_directory;
	private Integer photo_storage_id;
	private String photo_storage_name;
	
	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}
	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	/**
	 * @return the upload_directory
	 */
	public String getUpload_directory() {
		return upload_directory;
	}
	/**
	 * @param upload_directory the upload_directory to set
	 */
	public void setUpload_directory(String upload_directory) {
		this.upload_directory = upload_directory;
	}
	/**
	 * @return the photo_storage_id
	 */
	public Integer getPhoto_storage_id() {
		return photo_storage_id;
	}
	/**
	 * @param photo_storage_id the photo_storage_id to set
	 */
	public void setPhoto_storage_id(Integer photo_storage_id) {
		this.photo_storage_id = photo_storage_id;
	}
	/**
	 * @return the photo_storage_name
	 */
	public String getPhoto_storage_name() {
		return photo_storage_name;
	}
	/**
	 * @param photo_storage_name the photo_storage_name to set
	 */
	public void setPhoto_storage_name(String photo_storage_name) {
		this.photo_storage_name = photo_storage_name;
	}
}
