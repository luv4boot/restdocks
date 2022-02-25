package com.luv4code.restdocks.web.mapper;

import com.luv4code.restdocks.domain.Beer;
import com.luv4code.restdocks.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
