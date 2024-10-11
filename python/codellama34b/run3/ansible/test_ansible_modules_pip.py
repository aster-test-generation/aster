import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test_main(self):
        self.assertEqual(main(), 0)

    def test_setup_virtualenv(self):
        self.assertEqual(setup_virtualenv(), None)

    def test_get_pip(self):
        self.assertEqual(get_pip(), 3.14)

    def test_get_packages(self):
        self.assertEqual(get_packages(), [])

    def test_is_present(self):
        self.assertEqual(is_present(), False)

    def test_get_package_info(self):
        self.assertEqual(get_package_info(), {'name': 'pytest', 'version': '6.2.4'})

    def test_fail(self):
        self.assertEqual(fail(None), None)


if __name__ == '__main__':
    unittest.main()