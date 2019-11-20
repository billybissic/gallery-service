/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import storage.StorageProperties;
import storage.StorageService;

/**
 * @author Billy Bissic
 *
 */

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class GalleryService {

	public static void main(String[] args) {
		SpringApplication.run(GalleryService.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder, final StorageService storageService)
	{
		storageService.deleteAll();
		storageService.init();
		return builder.sources(GalleryService.class);
	}
}
