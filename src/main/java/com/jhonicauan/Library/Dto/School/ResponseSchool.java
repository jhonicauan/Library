package com.jhonicauan.Library.Dto.School;

import java.util.List;
import java.util.UUID;

public record ResponseSchool(UUID idSchool,String name,List<String> preferenceColors) {
}