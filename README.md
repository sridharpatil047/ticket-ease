# TicketEase

A monolithic backend system for a Drama `Plays` ticket booking platform, built for MVP use by a solo developer.
Supports user registration, event discovery, seat selection, booking flow, e-ticket generation, and admin-controlled
event/show management.

## Features

---

### 👤 User Management

- Users can register with email and password.
- Users can log in securely and receive a session token (JWT).
- Authenticated users can access their account and booking history.
- Passwords are securely stored using hashing (e.g., BCrypt).

---

### 🎭 Event & Show Discovery

- Users can browse a list of upcoming `Plays`.
- `Plays` can be filtered by city, date and time.
- Users can search `Plays` using a keyword (title, description, artists or writer).
- Users can see list of `Plays` available with Theater, time and price.

---

### 🪑 Seat Selection & Locking

- Users can view available seats for a selected `Plays` in real-time.
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
- E-ticket includes `Plays` details, seat info, timing, and QR code.
- Tickets can be downloaded as PDF format.

---

### 📚 Booking History

- Users can view their past and upcoming bookings.
- Each booking includes `Plays` name, showtime, seats, and booking status.

---

### 🛠️ Admin Panel (Seeding Only)

- Admins can create, update, or delete `Plays` via secured APIs.
- Admins can define cities, `Plays` metadata, venues, and seating layouts.
- Admin-only actions are secured and require admin privileges.

---

## Tech Stack

---
- Java
- Spring Boot
- OAuth 2.0
- MySQL
