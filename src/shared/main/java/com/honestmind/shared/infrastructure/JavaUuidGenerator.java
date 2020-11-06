package com.honestmind.shared.infrastructure;

import com.honestmind.shared.domain.Service;
import com.honestmind.shared.domain.UuidGenerator;
import java.util.UUID;

@Service
public final class JavaUuidGenerator implements UuidGenerator {
  @Override
  public String generate() {
    return UUID.randomUUID().toString();
  }
}
