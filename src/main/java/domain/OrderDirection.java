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

@Document(collection = "gallery_order_direction")
public class OrderDirection {

	@Id private String _id;
	private String order_direction_name;
	private String order_direction_description;
	
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
	 * @return the order_direction_name
	 */
	public String getOrder_direction_name() {
		return order_direction_name;
	}
	/**
	 * @param order_direction_name the order_direction_name to set
	 */
	public void setOrder_direction_name(String order_direction_name) {
		this.order_direction_name = order_direction_name;
	}
	/**
	 * @return the order_direction_description
	 */
	public String getOrder_direction_description() {
		return order_direction_description;
	}
	/**
	 * @param order_direction_description the order_direction_description to set
	 */
	public void setOrder_direction_description(String order_direction_description) {
		this.order_direction_description = order_direction_description;
	}
}
