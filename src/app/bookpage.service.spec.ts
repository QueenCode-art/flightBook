import { TestBed } from '@angular/core/testing';

import { BookpageService } from './bookpage.service';

describe('BookpageService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BookpageService = TestBed.get(BookpageService);
    expect(service).toBeTruthy();
  });
});
