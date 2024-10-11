import unittest
from ansible.modules.command import CommandModule


class TestCommandModule(unittest.TestCase):
    def test_check_command_curl(self):
        module = CommandModule()
        commandline = ['curl', 'https://example.com']
        module.check_command(module, commandline)

    def test_check_command_wget(self):
        module = CommandModule()
        commandline = ['wget', 'https://example.com']
        module.check_command(module, commandline)

    def test_check_command_svn(self):
        module = CommandModule()
        commandline = ['svn', 'checkout', 'https://example.com']
        module.check_command(module, commandline)

    def test_check_command_service(self):
        module = CommandModule()
        commandline = ['service', 'nginx', 'start']
        module.check_command(module, commandline)

    def test_check_command_mount(self):
        module = CommandModule()
        commandline = ['mount', '/mnt', '/dev/sdb1']
        module.check_command(module, commandline)

    def test_check_command_rpm(self):
        module = CommandModule()
        commandline = ['rpm', '-qa']
        module.check_command(module, commandline)

    def test_check_command_yum(self):
        module = CommandModule()
        commandline = ['yum', 'install', 'nginx']
        module.check_command(module, commandline)

    def test_check_command_apt_get(self):
        module = CommandModule()
        commandline = ['apt-get', 'install', 'nginx']
        module.check_command(module, commandline)

    def test_check_command_tar(self):
        module = CommandModule()
        commandline = ['tar', '-czf', 'archive.tar.gz', '/path/to/directory']
        module.check_command(module, commandline)

    def test_check_command_unzip(self):
        module = CommandModule()
        commandline = ['unzip', 'archive.zip']
        module.check_command(module, commandline)

    def test_check_command_sed(self):
        module = CommandModule()
        commandline = ['sed', '-i', 's/old/new/g', '/path/to/file']
        module.check_command(module, commandline)

    def test_check_command_dnf(self):
        module = CommandModule()
        commandline = ['dnf', 'install', 'nginx']
        module.check_command(module, commandline)

    def test_check_command_zypper(self):
        module = CommandModule()
        commandline = ['zypper', 'install', 'nginx']
        module.check_command(module, commandline)

if __name__ == '__main__':
    unittest.main()