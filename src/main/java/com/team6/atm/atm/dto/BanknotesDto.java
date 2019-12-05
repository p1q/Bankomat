package com.team6.atm.atm.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BanknotesDto {
    @NotNull
    @NotEmpty
    private Long value;
    @NotNull
    @NotEmpty
    private Long amount;
}
