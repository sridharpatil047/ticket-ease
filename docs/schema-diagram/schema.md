classDiagram
direction BT
class booking {
   datetime(6) created_at
   datetime(6) updated_at
   enum('booked', 'cancelled', 'failed', 'in_progress') status
   bigint user_id
   bigint id
}
class booking_show_seats {
   bigint booking_id
   bigint show_seats_id
}
class payment {
   datetime(6) created_at
   datetime(6) updated_at
   double amount
   enum('card', 'net_banking', 'upi') payment_mode
   enum('confirmed', 'failed', 'pending', 'refunded') payment_status
   bigint booking_id
   bigint id
}
class play {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) name
   varchar(255) poster_url
   bigint writer_id
   bigint id
}
class play_actors {
   bigint play_id
   bigint actors_id
}
class pricing {
   datetime(6) created_at
   datetime(6) updated_at
   double price
   bigint seat_type_id
   bigint show_id
   bigint id
}
class role {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) name
   bigint id
}
class seat {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) coll
   varchar(255) roww
   bigint theater_id
   bigint type_id
   bigint id
}
class seat_type {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) name
   bigint id
}
class show_seat {
   datetime(6) created_at
   datetime(6) updated_at
   datetime(6) available_at
   enum('available', 'blocked', 'booked') status
   bigint seat_id
   bigint show_id
   bigint user_id
   bigint id
}
class showw {
   datetime(6) created_at
   datetime(6) updated_at
   datetime(6) date_time
   bigint play_id
   bigint theater_id
   bigint id
}
class talent {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) name
   bigint id
}
class talent_talent_type {
   bigint talent_id
   bigint talent_type_id
}
class talent_type {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) name
   bigint id
}
class theater {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) address1
   varchar(255) address2
   varchar(255) city
   varchar(255) country
   varchar(255) pin
   varchar(255) state
   varchar(255) name
   bigint id
}
class ticket {
   datetime(6) created_at
   datetime(6) updated_at
   double price
   varchar(255) qr_code_url
   enum('invalid', 'valid') status
   bigint booking_id
   bigint id
}
class user {
   datetime(6) created_at
   datetime(6) updated_at
   varchar(255) email
   varchar(255) name
   bigint id
}
class user_roles {
   bigint user_id
   bigint roles_id
}

booking  -->  user : user_id:id
booking_show_seats  -->  booking : booking_id:id
booking_show_seats  -->  show_seat : show_seats_id:id
payment  -->  booking : booking_id:id
play  -->  talent : writer_id:id
play_actors  -->  play : play_id:id
play_actors  -->  talent : actors_id:id
pricing  -->  seat_type : seat_type_id:id
pricing  -->  showw : show_id:id
seat  -->  seat_type : type_id:id
seat  -->  theater : theater_id:id
show_seat  -->  seat : seat_id:id
show_seat  -->  showw : show_id:id
show_seat  -->  user : user_id:id
showw  -->  play : play_id:id
showw  -->  theater : theater_id:id
talent_talent_type  -->  talent : talent_id:id
talent_talent_type  -->  talent_type : talent_type_id:id
ticket  -->  booking : booking_id:id
user_roles  -->  role : roles_id:id
user_roles  -->  user : user_id:id
