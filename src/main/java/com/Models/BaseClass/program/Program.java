package com.Models.BaseClass.program;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mepesh on 10/26/2017.
 */
@Entity
public class Program {
    @Id
    private Long programId;
    private String programName;

    public Program() {
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
