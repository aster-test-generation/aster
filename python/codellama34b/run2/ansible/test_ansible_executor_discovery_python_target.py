import unittest
from ansible.executor.discovery.python_target import *


class TestPythonTarget(unittest.TestCase):
    def test_read_utf8_file(self):
        path = "path/to/file"
        encoding = "utf-8"
        result = read_utf8_file(path, encoding)
        self.assertEqual(result, None)

    def test_get_platform_info(self):
        result = get_platform_info()
        self.assertEqual(result, dict(platform_dist_result=[], osrelease_content='NAME="Red Hat Enterprise Linux"\nVERSION="7.4 (Maipo)"\nID="rhel"\nID_LIKE="fedora"\nVARIANT="Server"\nVARIANT_ID="server"\nVERSION_ID="7.4"\nPRETTY_NAME="Red Hat Enterprise Linux[594 chars]"\n'))

    def test_main(self):
        main()

if __name__ == '__main__':
    unittest.main()