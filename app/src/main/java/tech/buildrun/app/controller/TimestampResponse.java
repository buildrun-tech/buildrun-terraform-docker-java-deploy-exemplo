package tech.buildrun.app.controller;

import java.time.Instant;

public record TimestampResponse(Instant requestDateTime) {
}
