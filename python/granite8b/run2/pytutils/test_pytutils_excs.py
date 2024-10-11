import unittest
from pytutils.excs import ok


class TestOk(unittest.TestCase):
    def test_ok_with_no_exceptions(self):
        with ok():
            pass

    def test_ok_with_specific_exception(self):
        with ok(ZeroDivisionError):
            pass

    def test_ok_with_multiple_exceptions(self):
        with ok(ZeroDivisionError, TypeError):
            pass

    def test_ok_with_specific_exception_in_try_block(self):
        try:
            raise ZeroDivisionError
        except ZeroDivisionError:
            with ok(ZeroDivisionError):
                pass

    def test_ok_with_specific_exception_in_except_block(self):
        try:
            pass
        except ZeroDivisionError:
            with ok(ZeroDivisionError):
                pass

    def test_ok_with_specific_exception_in_finally_block(self):
        try:
            pass
        except ZeroDivisionError:
            pass
        finally:
            with ok(ZeroDivisionError):
                pass

    def test_ok_with_specific_exception_in_nested_try_except_blocks(self):
        try:
            try:
                raise ZeroDivisionError
            except ZeroDivisionError:
                pass
        except ZeroDivisionError:
            with ok(ZeroDivisionError):
                pass

    def test_ok_with_specific_exception_in_nested_try_except_finally_blocks(self):
        try:
            try:
                raise ZeroDivisionError
            except ZeroDivisionError:
                pass
        except ZeroDivisionError:
            pass
        finally:
            with ok(ZeroDivisionError):
                pass

    def test_ok_with_specific_exception_in_nested_try_except_blocks_with_multiple_exceptions(self):
        try:
            try:
                raise ZeroDivisionError
            except ZeroDivisionError:
                pass
        except (ZeroDivisionError, TypeError):
            with ok(ZeroDivisionError, TypeError):
                pass

    def test_ok_with_specific_exception_in_nested_try_except_finally_blocks_with_multiple_exceptions(self):
        try:
            try:
                raise ZeroDivisionError
            except ZeroDivisionError:
                pass
        except (ZeroDivisionError, TypeError):
            pass
        finally:
            with ok(ZeroDivisionError, TypeError):
                pass

if __name__ == '__main__':
    unittest.main()