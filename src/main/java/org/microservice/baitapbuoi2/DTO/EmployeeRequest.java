package org.microservice.baitapbuoi2.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    private String empName;
    private Double start;
    private Double end;
    private Integer page;
    private Integer itemPerPage;
    private String orderBy;
    private String direction;
}
