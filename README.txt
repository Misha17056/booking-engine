# Booking Engine

A high-performance, domain-agnostic booking engine core designed to manage resource reservations (co-working spaces, hotels, sports venues, equipment rentals) with concurrency control, protection against overbooking, and high-load capabilities.

---

## Phase 0 — Architecture Vision & Domain Concept

### 1. Domain Abstraction: `Resource`
The central domain entity of the system is a **`Resource`**. It represents an abstract, time-reserved physical or digital item with a limited capacity:
* **Hotels / Hospitality:** Rooms (`ROOM`), Beds (`BED`).
* **Co-working / Offices:** Meeting Rooms (`MEETING_ROOM`), Workdesks (`DESK`).
* **Sports / Leisure:** Tennis Courts (`TENNIS_COURT`), Trainer Time Slots (`TRAINER_SLOT`).
* **Rentals / Fleet:** Vehicles (`CAR`), Equipment (`EQUIPMENT`).

### 2. High-Level Data Flow

```mermaid
sequenceDiagram
    autonumber
    actor User as Client / User
    participant API as Availability API
    participant Service as Booking Service
    participant DB as PostgreSQL / Redis

    User->>API: GET /api/resources/available (start, end)
    API->>DB: Query non-overlapping time slots
    DB-->>API: Return available resource IDs
    API-->>User: Return available resource list

    User->>Service: POST /api/bookings (resource_id, start, end)
    Note over Service: Validate date ranges & resource status
    Note over Service: Concurrency Control (Prevent Overbooking)
    Service->>DB: Save Booking (Status: CONFIRMED)
    DB-->>Service: Persistence Acknowledged
    Service-->>User: Return BookingResponse (ID, Status)