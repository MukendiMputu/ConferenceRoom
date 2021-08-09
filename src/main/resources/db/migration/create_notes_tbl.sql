CREATE TABLE `notes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `booking_id` int(11) DEFAULT NULL,
  `content` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `prev_note` bigint(20) DEFAULT NULL,
  `created_at` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `updated_at` datetime(6) NOT NULL DEFAULT current_timestamp(6) ON UPDATE current_timestamp(6),
  PRIMARY KEY (`id`),
  KEY `index_notes_on_booking_id` (`booking_id`),
  KEY `fk_noteList_idx` (`prev_note`),
  CONSTRAINT `fk_noteList` FOREIGN KEY (`prev_note`) REFERENCES `notes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=219 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;