package com.example.bookmyshow.controllers;

import com.example.bookmyshow.Models.Booking;
import com.example.bookmyshow.controllers.dto.BookMovieRequestDTO;
import com.example.bookmyshow.controllers.dto.BookMovieResponseDTO;
import com.example.bookmyshow.controllers.enums.ResponseStatus;
import com.example.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    public BookMovieResponseDTO bookMovie(BookMovieRequestDTO requestDTO){
        BookMovieResponseDTO responseDTO = new BookMovieResponseDTO();

        try {
            Booking booking = bookingService.bookMovie(
                    requestDTO.getUserId(),
                    requestDTO.getShowId(),
                    requestDTO.getShowSeatIds()
            );

            responseDTO.setBookingId(booking.getId());
            responseDTO.setAmount(booking.getAmount());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            responseDTO.setStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }

}