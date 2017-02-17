package com.sipingsoft.office.web.repository;

import java.util.List;

import com.sipingsoft.office.web.entity.Spittle;

public interface UserRepository {

    List<Spittle> findSpittles(long max, int count);
}
