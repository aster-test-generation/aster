import unittest
from unittest.mock import MagicMock
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.check_mode = False
        self.dest = '/path/to/dest'
        self.repo = 'svn+ssh://an.example.org/path/to/repo'
        self.revision = 'HEAD'
        self.username = 'user'
        self.password = 'password'
        self.svn_path = '/path/to/svn'
        self.validate_certs = True
        self.subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)

    def test_get_remote_revision(self):
        text = 'Revision: 12345\n'
        self.subversion._exec = MagicMock(return_value=text)
        rev = self.subversion.get_remote_revision()
        self.assertEqual(rev, '12345')

    def test_has_local_mods(self):
        lines = ['M file1.txt', 'A file2.txt', 'D file3.txt']
        self.subversion._exec = MagicMock(return_value=lines)
        result = self.subversion.has_local_mods()
        self.assertTrue(result)

    def test_needs_update(self):
        curr = '12345'
        url = 'svn+ssh://an.example.org/path/to/repo'
        out2 = 'Revision: 54321\n'
        self.subversion.get_revision = MagicMock(return_value=(curr, url))
        self.subversion._exec = MagicMock(return_value=out2)
        change, curr, head = self.subversion.needs_update()
        self.assertTrue(change)
        self.assertEqual(curr, '12345')
        self.assertEqual(head, '54321')

if __name__ == '__main__':
    unittest.main()