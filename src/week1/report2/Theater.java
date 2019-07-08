package week1.report2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Theater{
  
  
  final private List<TicketOffice> ticketOffices = new ArrayList<>();
  final private List<Movie> movies = new ArrayList<>();
  
  public void setTicketOffices(TicketOffice ... ticketOffices) {
    this.ticketOffices.addAll(Arrays.asList(ticketOffices));
  }
  public void setMovies(Movie ... movies) {
    this.movies.addAll(Arrays.asList(movies));
  }
  
  public void setTicket( TicketOffice ticketOffice, Movie movie ,  Long num){
    if(!ticketOffices.contains(ticketOffice)) return;
    if(!movies.contains(movie)) return;
    while(num-- > 0) {
      movie.addTicket();
    }
    ticketOffice.setMovies(movie);
  }
  
}