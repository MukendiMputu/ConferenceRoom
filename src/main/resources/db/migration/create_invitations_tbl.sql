CREATE TABLE `invitations` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `guest_id` int(11) DEFAULT NULL,
  `booking_id` int(11) DEFAULT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `updated_at` datetime(6) NOT NULL DEFAULT current_timestamp(6) ON UPDATE current_timestamp(6),
  PRIMARY KEY (`id`),
  KEY `index_invitations_on_booking_id_and_guest_id` (`booking_id`,`guest_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;