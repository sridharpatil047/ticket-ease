# TicketEase

A monolithic backend system for a Drama (`Play`) ticket booking platform, built for MVP use by a solo developer.
Supports user registration, event discovery, seat selection, booking flow, e-ticket generation, and admin-controlled
`Play` management.

## Features

### 👤 User Management

- Users can register with email and password.
- Users can log in securely and receive a session token (JWT).
- Authenticated users can access their account and booking history.

---

### 🎭 Play Discovery

- Users can browse a list of upcoming `Play`.
- `Play` can be filtered by city, date and time.
- Users can search `Play` using a keyword (title, description, artists and/or writer).
- Users can see list of `Play` available with the Theater, time and price.

---

### 🪑 Seat Selection & Locking

- Users can view available seats for a selected `Play` in real-time.
- Users can select and lock seats for 5 minutes.
- System prevents double-booking by locking seats atomically.
- Locked seats expire automatically if not booked within the timeout window (5 minutes).

---

### 🎟️ Booking & Confirmation

- Users can confirm their booking for selected and locked seats.
- Booking generates a unique booking ID and status.
- System ensures only valid seat locks can be confirmed as bookings.

---

### 📄 E-Ticket Generation

- Users receive a digital ticket upon successful booking.
- E-ticket includes `Play` details, seat info, timing, and QR code.
- Tickets can be downloaded as PDF format.

---

### 📚 Booking History

- Users can view their past and upcoming bookings.
- Each booking includes `Play` name, showtime, seats, and booking status.

---

### 🛠️ Admin Panel (Seeding Only)

- Admins can create, update, or delete `Play` via secured APIs.
- Admins can define cities, `Play` metadata, venues, and seating layouts.
- Admin-only actions are secured and require admin privileges.

---

## Tech Stack

- Java
- Spring Boot
- OAuth 2.0
- MySQL
- Elasticsearch
- Docker


## Class Diagram
(to do)

## Schema Diagram
(to do)

---
## See more...
### [Project Timeline](docs/timeline.md)
### [API Docs](docs/api-docs.md)


