CREATE TABLE `rooms` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `building` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `number` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `capacity` mediumint(9) DEFAULT NULL,
  `configuration` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `picture` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `avantgarde` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `updated_at` datetime(6) NOT NULL DEFAULT current_timestamp(6) ON UPDATE current_timestamp(6),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;