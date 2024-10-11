import unittest
from ansible.modules.systemd import request_was_ignored


class TestSystemdModule(unittest.TestCase):
    def test_request_was_ignored_with_ignored_request(self):
        result = request_was_ignored("ignoring request")
        self.assertTrue(result)

    def test_request_was_ignored_with_ignored_command(self):
        result = request_was_ignored("ignoring command")
        self.assertTrue(result)

    def test_request_was_ignored_with_equals_sign(self):
        result = request_was_ignored("some=value")
        self.assertFalse(result)

    def test_request_was_ignored_with_no_ignored_text(self):
        result = request_was_ignored("some random text")
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()