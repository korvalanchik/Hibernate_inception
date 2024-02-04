package org.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;


@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    private long id; // - ������������� ������, ��������� ���������� ����, �������������� �����.
    private Timestamp created_at; // - TIMESTAMP � UTC, ���� ��� ��������� ��� ������
    private long client_id; // - ������������� �볺���, ����� �������� ��� ������.
    private long from_planet_id; // - ������������� �������, ����� ������������� �������
    private long to_planet_id;
}
