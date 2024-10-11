import unittest
from ansible.modules.apt_repository import AptRepository


class TestAptRepository(unittest.TestCase):
    def test_add_source(self):
        apt_repo = AptRepository()
        apt_repo.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertEqual(len(apt_repo.files), 1)
        self.assertEqual(len(apt_repo.files[apt_repo.default_file]), 1)
        self.assertEqual(apt_repo.files[apt_repo.default_file][0][1], True)
        self.assertEqual(apt_repo.files[apt_repo.default_file][0][2], 'deb http://archive.canonical.com/ubuntu hardy partner')

    def test_remove_source(self):
        apt_repo = AptRepository()
        apt_repo.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        apt_repo.remove_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertEqual(len(apt_repo.files), 1)
        self.assertEqual(len(apt_repo.files[apt_repo.default_file]), 0)

    def test_modify_source(self):
        apt_repo = AptRepository()
        apt_repo.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        apt_repo.modify_source('deb http://archive.canonical.com/ubuntu hardy partner', enabled=False)
        self.assertEqual(len(apt_repo.files), 1)
        self.assertEqual(len(apt_repo.files[apt_repo.default_file]), 1)
        self.assertEqual(apt_repo.files[apt_repo.default_file][0][1], False)
        self.assertEqual(apt_repo.files[apt_repo.default_file][0][2], 'deb http://archive.canonical.com/ubuntu hardy partner')

if __name__ == '__main__':
    unittest.main()