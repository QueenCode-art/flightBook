import { TestBed } from '@angular/core/testing';

import { FlightinfoService } from './flightinfo.service';

describe('FlightinfoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FlightinfoService = TestBed.get(FlightinfoService);
    expect(service).toBeTruthy();
  });
});
