package com.projects.Whistle.Blower.Repository;

import com.projects.Whistle.Blower.Model.WhistleBlowerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhistleBlowerRepository extends JpaRepository<WhistleBlowerModel, Long> {
}
