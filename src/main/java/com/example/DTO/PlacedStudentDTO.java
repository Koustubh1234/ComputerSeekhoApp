package com.example.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlacedStudentDTO {

    private Integer batchId;
    private String batchName;
    private String studentName;
    private String photoUrl;
    private String recruiterName;

    // ✅ EXPLICIT constructor for JPQL
    public PlacedStudentDTO(
            Integer batchId,
            String batchName,
            String studentName,
            String photoUrl,
            String recruiterName
    ) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.studentName = studentName;
        this.photoUrl = photoUrl;
        this.recruiterName = recruiterName;
    }
}
