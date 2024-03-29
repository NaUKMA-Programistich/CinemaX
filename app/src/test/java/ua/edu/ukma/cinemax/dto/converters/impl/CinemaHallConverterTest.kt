package ua.edu.ukma.cinemax.dto.converters.impl

import org.junit.jupiter.api.Test
import ua.edu.ukma.cinemax.dto.CinemaHallDto
import ua.edu.ukma.cinemax.dto.converter.impl.CinemaHallConverterImpl
import ua.edu.ukma.cinemax.persistance.entity.CinemaHall

class CinemaHallConverterTest {


    private val instance = CinemaHallConverterImpl()


    @Test
    fun `From DTO to Model`() {
        val cinemaHallDto = CinemaHallDto(1, "Test name", null, 2, 3, null)
        val cinemaHall = instance.createFrom(cinemaHallDto)
        assert(cinemaHall.id == cinemaHallDto.id)
        assert(cinemaHall.name == cinemaHallDto.name)
        assert(cinemaHall.description == cinemaHallDto.description)
        assert(cinemaHall.aisles == cinemaHallDto.aisles)
        assert(cinemaHall.seatsPerAisle == cinemaHallDto.seatsPerAisle)
    }

    @Test
    fun `From Model to DTO`() {
        val cinemaHall = CinemaHall(1, "Test name", null, 2, 3)

        val dto = instance.createFrom(cinemaHall)

        assert(dto.id == cinemaHall.id)
        assert(dto.name == cinemaHall.name)
        assert(dto.description == cinemaHall.description)
        assert(dto.aisles == cinemaHall.aisles)
        assert(dto.seatsPerAisle == cinemaHall.seatsPerAisle)
    }
}