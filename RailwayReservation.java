/* 
 * 18. Railway Reservation System
 * Create a class RailwayReservation. Use synchronization to avoid double booking.
 * Output: 'Ticket booked successfully' or 'No tickets available'
 */
class RailwayReservation {
    private int ticketsAvailable = 1;

    public synchronized void bookTicket(String passengerName) {
        if (ticketsAvailable > 0) {
            System.out.println(passengerName + ": Ticket booked successfully");
            ticketsAvailable--;
        } else {
            System.out.println(passengerName + ": No tickets available");
        }
    }
}
