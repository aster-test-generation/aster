import unittest
import ansible.modules.subversion


def test_get_remote_revision():
    instance = ansible.modules.subversion.Subversion(None, '/path/to/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', True)
    result = instance.get_remote_revision()
    assert result == '12345'

def test_has_local_mods():
    instance = ansible.modules.subversion.Subversion(None, '/path/to/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, 'svn', True)
    result = instance.has_local_mods()
    assert result == True

if __name__ == '__main__':
    unittest.main()