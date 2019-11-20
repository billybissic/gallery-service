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
@Document(collection = "gallery_order_category")
public class OrderCategory {
	
	@Id private String _id;
	private String gallery_order_category_name;
	private String gallery_order_category_description;
	
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
	 * @return the gallery_order_category_name
	 */
	public String getGallery_order_category_name() {
		return gallery_order_category_name;
	}
	/**
	 * @param gallery_order_category_name the gallery_order_category_name to set
	 */
	public void setGallery_order_category_name(String gallery_order_category_name) {
		this.gallery_order_category_name = gallery_order_category_name;
	}
	/**
	 * @return the gallery_order_category_description
	 */
	public String getGallery_order_category_description() {
		return gallery_order_category_description;
	}
	/**
	 * @param gallery_order_category_description the gallery_order_category_description to set
	 */
	public void setGallery_order_category_description(String gallery_order_category_description) {
		this.gallery_order_category_description = gallery_order_category_description;
	}
}
